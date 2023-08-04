package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopItem
import javax.inject.Inject

class ShopListMapper @Inject constructor() {

    fun mapEntityToDBModel(shopItem: ShopItem) = ShopItemDbModel (
        id = shopItem.id,
        name = shopItem.name,
        count = shopItem.count,
        enabled = shopItem.enabled
    )

    fun mapDBModelToEntity(shopItemDbModel: ShopItemDbModel) = ShopItem (
        id = shopItemDbModel.id,
        name = shopItemDbModel.name,
        count = shopItemDbModel.count,
        enabled = shopItemDbModel.enabled
    )

    fun mapListDBModelToListEntity(list: List<ShopItemDbModel>) = list.map {
        mapDBModelToEntity(it)
    }
}