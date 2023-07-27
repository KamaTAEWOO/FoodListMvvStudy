package com.dk.foodlistmvvstudy.mapper

import com.dk.foodlistmvvstudy.model.Food
import com.dk.foodlistmvvstudy.model.FoodEntity

object FoodMapper {

    fun FoodEntity.toRequest() = Food(
        cnt = cnt,
        opendataId = OPENDATA_ID,
        gngCs = GNG_CS,
        fdCs = FD_CS,
        bzNm = BZ_NM,
        tlno = TLNO,
        mbzHr = MBZ_HR,
        seatCnt = SEAT_CNT,
        pkpl = PKPL,
        hp = HP,
        psbFrn = PSB_FRN,
        bknYn = BKN_YN,
        infnFcl = INFN_FCL,
        brftYn = BRFT_YN,
        dssrtYn = DSSRT_YN,
        mnu = MNU,
        smplDesc = SMPL_DESC,
        sbw = SBW,
        bus = BUS,)
}