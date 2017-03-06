package com.alamodrafthouse.data;

import com.alamodrafthouse.data.model.CategoryModel;
import com.alamodrafthouse.data.services.ApiService;
import java.util.List;
import rx.Observable;

/**
 * Created by Shekar on 3/3/17.
 */

public class DataManager {
  private ApiService mApiService;

  public DataManager(ApiService apiService) {

    mApiService = apiService;
  }

  public Observable<List<CategoryModel>> getCategorys() {
    return mApiService.getCategorys();
  }
}
