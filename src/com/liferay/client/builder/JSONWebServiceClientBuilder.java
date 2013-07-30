/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.client.builder;

import com.liferay.client.builder.handler.JSONResponseHandler;
import com.liferay.client.builder.velocity.VelocityUtil;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @author Bruno Farache
 */
public class JSONWebServiceClientBuilder {

	public static void main(String[] args) {
		Map<String, String> arguments = parseArguments(args);

		String url = arguments.get("url");
		String serviceContext = arguments.get("service.context");

		StringBuilder sb = new StringBuilder();

		sb.append(url);
		sb.append("/api/jsonws?discover");

		if ((serviceContext != null) && !serviceContext.equals("")) {
			sb.append("=/");
			sb.append(serviceContext);
			sb.append("/*");
		}

		HttpClient client = new DefaultHttpClient();

		HttpGet get = new HttpGet(sb.toString());

		JSONResponseHandler handler = new JSONResponseHandler();

		try {
			Map<String, Object> result = client.execute(get, handler);

			@SuppressWarnings("unchecked")
			Map<String, Object> actions = (Map<String, Object>)result.get(
				"actions");

			VelocityUtil.generate("android/", actions);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Map<String, String> parseArguments(String[] args) {
		Map<String, String> arguments = new HashMap<String, String>();

		for (String arg : args) {
			int pos = arg.indexOf('=');

			if (pos <= 0) {
				throw new IllegalArgumentException("Bad argument " + arg);
			}

			String key = arg.substring(0, pos).trim();
			String value = arg.substring(pos + 1).trim();

			arguments.put(key, value);
		}

		return arguments;
	}

}