package br.com.nglauber.tdcapp.data.remote.model

import com.google.gson.annotations.SerializedName

data class TdcSpeaker (
        val id: Long,
        val member: TdcMember,
        @SerializedName("minibio")
        val miniBio: TdcMiniBio
)