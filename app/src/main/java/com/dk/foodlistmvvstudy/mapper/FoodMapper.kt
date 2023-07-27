package com.dk.foodlistmvvstudy.mapper

import com.dk.foodlistmvvstudy.model.Food
import com.dk.foodlistmvvstudy.model.FoodEntity

object FoodMapper {

    fun FoodEntity.toRequest() = Food (
        cnt = cnt ?: "null",
        opendataId = OPENDATA_ID ?: "null",
        gngCs = GNG_CS ?: "null",
        fdCs = FD_CS ?: "null",
        bzNm = BZ_NM ?: "null",
        tlno = TLNO ?: "null",
        mbzHr = MBZ_HR ?: "null",
        seatCnt = SEAT_CNT ?: "null",
        pkpl = PKPL ?: "null",
        hp = HP ?: "null",
        psbFrn = PSB_FRN ?: "null",
        bknYn = BKN_YN ?: "null",
        infnFcl = INFN_FCL ?: "null",
        brftYn = BRFT_YN ?: "null",
        dssrtYn = DSSRT_YN ?: "null",
        mnu = MNU ?: "null",
        smplDesc = SMPL_DESC ?: "null",
        sbw = SBW ?: "null",
        bus = BUS ?: "null",
    )
}