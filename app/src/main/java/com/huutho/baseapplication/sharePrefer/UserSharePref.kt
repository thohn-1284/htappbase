package com.huutho.baseapplication.sharePrefer

import android.content.Context
import com.google.gson.Gson
import com.huutho.baselibrary.BaseSharePref

class UserSharePref(context: Context, nameOfSharePref: String, gson: Gson) :
    BaseSharePref(context, nameOfSharePref, gson)