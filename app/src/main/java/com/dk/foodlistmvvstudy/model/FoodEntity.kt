package com.dk.foodlistmvvstudy.model

// 서버에 있는 Json 파일과 변수를 맞춰줘야 들고 올 수 있음.

data class FoodEntity (
    val cnt: String,
    val OPENDATA_ID: String,
    val GNG_CS: String,
    val FD_CS: String,
    val BZ_NM: String,
    val TLNO: String,
    val MBZ_HR: String,
    val SEAT_CNT: String,
    val PKPL: String,
    val HP: String,
    val PSB_FRN: String,
    val BKN_YN: String,
    val INFN_FCL: String,
    val BRFT_YN: String,
    val DSSRT_YN: String,
    val MNU: String,
    val SMPL_DESC: String,
    val SBW: String,
    val BUS: String
)