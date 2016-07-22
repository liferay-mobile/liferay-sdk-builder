package com.liferay.mobile.sdk.v7.assetcategory;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/assetcategory")
public interface AssetCategoryService {
  @Path("/search")
  Call<JSONArray> search(@Param(name = "groupId") long groupId, @Param(name = "keywords") String keywords, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "categoryProperties") JSONArray categoryProperties, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "name") String name, @Param(name = "vocabularyIds") JSONArray vocabularyIds, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/fetch-category")
  Call<JSONObject> fetchCategory(@Param(name = "categoryId") long categoryId);

  @Path("/get-categories")
  Call<JSONArray> getCategories(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/get-vocabulary-categories")
  Call<JSONArray> getVocabularyCategories(@Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-vocabulary-categories")
  Call<JSONArray> getVocabularyCategories(@Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-vocabulary-categories")
  Call<JSONArray> getVocabularyCategories(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-vocabulary-categories")
  Call<JSONArray> getVocabularyCategories(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-vocabulary-categories-count")
  Call<Integer> getVocabularyCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "parentCategory") long parentCategory, @Param(name = "vocabularyId") long vocabularyId);

  @Path("/get-vocabulary-categories-count")
  Call<Integer> getVocabularyCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "vocabularyId") long vocabularyId);

  @Path("/get-vocabulary-categories-count")
  Call<Integer> getVocabularyCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "vocabularyId") long vocabularyId);

  @Path("/get-category")
  Call<JSONObject> getCategory(@Param(name = "categoryId") long categoryId);

  @Path("/add-category")
  Call<JSONObject> addCategory(@Param(name = "groupId") long groupId, @Param(name = "title") String title, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-category")
  Call<JSONObject> addCategory(@Param(name = "groupId") long groupId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "categoryProperties") JSONArray categoryProperties, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-categories")
  Call<JSONArray> deleteCategories(@Param(name = "categoryIds") JSONArray categoryIds, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/delete-categories")
  Call<Response> deleteCategories(@Param(name = "categoryIds") JSONArray categoryIds);

  @Path("/delete-category")
  Call<Response> deleteCategory(@Param(name = "categoryId") long categoryId);

  @Path("/get-child-categories")
  Call<JSONArray> getChildCategories(@Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-child-categories")
  Call<JSONArray> getChildCategories(@Param(name = "parentCategoryId") long parentCategoryId);

  @Path("/get-vocabulary-root-categories")
  Call<JSONArray> getVocabularyRootCategories(@Param(name = "groupId") long groupId, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-vocabulary-root-categories-count")
  Call<Integer> getVocabularyRootCategoriesCount(@Param(name = "groupId") long groupId, @Param(name = "vocabularyId") long vocabularyId);

  @Path("/move-category")
  Call<JSONObject> moveCategory(@Param(name = "categoryId") long categoryId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-category")
  Call<JSONObject> updateCategory(@Param(name = "categoryId") long categoryId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "categoryProperties") JSONArray categoryProperties, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/get-category-path")
  Call<String> getCategoryPath(@Param(name = "categoryId") long categoryId);

  @Path("/get-vocabulary-categories-display")
  Call<JSONObject> getVocabularyCategoriesDisplay(@Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/get-vocabulary-categories-display")
  Call<JSONObject> getVocabularyCategoriesDisplay(@Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/search-categories-display")
  Call<JSONObject> searchCategoriesDisplay(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "title") String title, @Param(name = "parentCategoryIds") JSONArray parentCategoryIds, @Param(name = "vocabularyIds") JSONArray vocabularyIds, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search-categories-display")
  Call<JSONObject> searchCategoriesDisplay(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "title") String title, @Param(name = "vocabularyIds") JSONArray vocabularyIds, @Param(name = "parentCategoryIds") JSONArray parentCategoryIds, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "sort", className = "") JSONObject sort);

  @Path("/search-categories-display")
  Call<JSONObject> searchCategoriesDisplay(@Param(name = "groupId") long groupId, @Param(name = "title") String title, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search-categories-display")
  Call<JSONObject> searchCategoriesDisplay(@Param(name = "groupId") long groupId, @Param(name = "title") String title, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search-categories-display")
  Call<JSONObject> searchCategoriesDisplay(@Param(name = "groupId") long groupId, @Param(name = "title") String title, @Param(name = "vocabularyId") long vocabularyId, @Param(name = "parentCategoryId") long parentCategoryId, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "sort", className = "") JSONObject sort);

  @Path("/search-categories-display")
  Call<JSONObject> searchCategoriesDisplay(@Param(name = "groupIds") JSONArray groupIds, @Param(name = "title") String title, @Param(name = "vocabularyIds") JSONArray vocabularyIds, @Param(name = "start") int start, @Param(name = "end") int end);
}
