package com.guc.gsideslip.func

/**
 * Created by guc on 2020/9/23.
 * Description：
 */
class Func9(initValue: Float, inParamMax: Float) : BaseFuncImpl(initValue, inParamMax) {
    override fun execute(inParam: Float): Float {
        super.execute(inParam)
        return if (inParam < inParamMax / 2) {
            inParamMin
        } else if (inParam >= inParamMax / 2) {
            val k = (outParamMax - outParamMin) / (inParamMax / 2)
            inParamMin + (inParam - inParamMax / 2) * k
        } else {
            outParamMax
        }
    }
}