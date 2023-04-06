package com.example.pb2_soal2

import android.os.Parcel
import android.os.Parcelable

data class Film(val image:Int, val name:String, val desc:String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
        parcel.writeString(desc)
    }
    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<Film> {
        override fun createFromParcel(parcel: Parcel): Film {
            return Film(parcel)
        }
        override fun newArray(size: Int): Array<Film?> {
            return arrayOfNulls(size)
        }
    }
}