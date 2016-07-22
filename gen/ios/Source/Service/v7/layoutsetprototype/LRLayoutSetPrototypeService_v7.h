/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#import "LRBaseService.h"

/**
 * @author Bruno Farache
 */
@interface LRLayoutSetPrototypeService_v7 : LRBaseService

- (NSDictionary *)addLayoutSetPrototypeWithNameMap:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addLayoutSetPrototypeWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteLayoutSetPrototypeWithLayoutSetPrototypeId:(long long)layoutSetPrototypeId error:(NSError **)error;
- (NSDictionary *)fetchLayoutSetPrototypeWithLayoutSetPrototypeId:(long long)layoutSetPrototypeId error:(NSError **)error;
- (NSDictionary *)getLayoutSetPrototypeWithLayoutSetPrototypeId:(long long)layoutSetPrototypeId error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long long)companyId active:(BOOL)active obc:(NSDictionary *)obc error:(NSError **)error;
- (NSDictionary *)updateLayoutSetPrototypeWithLayoutSetPrototypeId:(long long)layoutSetPrototypeId settings:(NSString *)settings error:(NSError **)error;
- (NSDictionary *)updateLayoutSetPrototypeWithLayoutSetPrototypeId:(long long)layoutSetPrototypeId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutSetPrototypeWithLayoutSetPrototypeId:(long long)layoutSetPrototypeId nameMap:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end