package com.w3engineers.ecommerce.uniqa.ui.search;

import com.w3engineers.ecommerce.uniqa.data.helper.base.MvpView;
import com.w3engineers.ecommerce.uniqa.data.helper.response.AddFavouriteResponse;
import com.w3engineers.ecommerce.uniqa.data.helper.response.ProductGridResponse;

public interface SearchMvpView extends MvpView {
    void onSearchSuccess(ProductGridResponse response);

    void onSearchError(String errorMessage);

    void onFavSuccess(AddFavouriteResponse response);
    void onFavError(String errorMessage);

    void onRemoveFavSuccess(AddFavouriteResponse response);
}
