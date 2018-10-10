package br.com.wellingtoncosta.bookhub.data.datasource.local.prefs

import android.content.Context

/**
 * @author Wellington Costa on 09/10/18.
 */
class Preferences(private val context: Context) {

    private val prefs by lazy {
        context.getSharedPreferences(PREFS_NAME, 0)
    }

    fun put(key: String, value: String) = prefs.edit().putString(key, value).apply()

    fun get(key: String) = prefs.getString(key, null) ?: ""

    companion object {
        const val PREFS_NAME = "book-hub-prefs"
    }

}