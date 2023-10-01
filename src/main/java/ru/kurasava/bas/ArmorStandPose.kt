package ru.kurasava.bas

import org.bukkit.util.EulerAngle

enum class ArmorStandPose (
    val hasArms: Boolean,
    val head: EulerAngle,
    val body: EulerAngle,
    val leftLeg: EulerAngle,
    val rightLeg: EulerAngle,
    val leftArm: EulerAngle,
    val rightArm: EulerAngle,
) {
    POSE_0(
        false,
        EulerAngle.ZERO, EulerAngle.ZERO,
        EulerAngle.ZERO, EulerAngle.ZERO,
        EulerAngle.ZERO, EulerAngle.ZERO,
    ),
    POSE_1(
        true,
        EulerAngle.ZERO, EulerAngle.ZERO,
        EulerAngle.ZERO, EulerAngle.ZERO,
        EulerAngle.ZERO, EulerAngle.ZERO,
    ),
    POSE_2(
        true,
        EulerAngle(-0.174533, 0.132665, 0.0261799), EulerAngle(0.08472, 0.0372665, 0.0261799),
        EulerAngle(0.0749066, -0.01253, -0.144533), EulerAngle(-0.0549066, 0.02237, 0.084533),
        EulerAngle(0.61799, 0.0, -0.51799), EulerAngle(-2.0944, 0.73421, 0.0),
    ),
    POSE_3(
        true,
        EulerAngle(0.214533, 0.09, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(-0.81799, 0.0, 0.51799), EulerAngle(4.4855, 6.28319, 1.0821),
    ),
    POSE_4(
        true,
        EulerAngle(0.0, 0.0, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(5.63741, 5.81195, 0.0), EulerAngle(5.63741, 0.575959, 0.0),
    ),
    POSE_5(
        true,
        EulerAngle(6.17847, 0.244346, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 6.14356), EulerAngle(5.06145, 0.20944, 0.174533),
    ),
    POSE_6(
        true,
        EulerAngle(6.03884, 0.0, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 6.17847), EulerAngle(0.0, 0.0, 0.10472),
        EulerAngle(4.32842, 0.610865, 0.0), EulerAngle(4.32842, 5.67232, 0.0),
    ),
    POSE_7(
        true,
        EulerAngle(6.17847, 0.0, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 6.14356), EulerAngle(0.0, 0.0, 0.10472),
        EulerAngle(4.36332, 5.74213, 0.0), EulerAngle(4.36332, 0.610865, 0.0),
    ),
    POSE_8(
        true,
        EulerAngle(6.17847, 0.0, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 6.14356), EulerAngle(0.0, 0.0, 0.10472),
        EulerAngle(0.0, 0.0, 6.00393), EulerAngle(5.23599, 5.16617, 0.0),
    ),
    POSE_9(
        true,
        EulerAngle(0.139626, 0.506145, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(5.95157, 0.0, 6.00393), EulerAngle(0.0, 0.0, 0.10472),
        EulerAngle(3.38594, 0.0, 1.0821), EulerAngle(4.72984, 5.63741, 5.5676),
    ),
    POSE_10(
        true,
        EulerAngle(6.07375, 6.21337, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(5.95157, 0.0, 6.00393), EulerAngle(5.60251, 0.0, 0.0),
        EulerAngle(4.59022, 0.0, 0.0), EulerAngle(4.79966, 0.0, 0.0),
    ),
    POSE_11(
        true,
        EulerAngle(6.07375, 6.21337, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(4.11898, 0.506145, 0.0), EulerAngle(0.0, 0.471239, 6.10865),
        EulerAngle(2.89725, 0.0, 0.680678), EulerAngle(3.31613, 0.0, 5.53269),
    ),
    POSE_12(
        true,
        EulerAngle(6.07375, 6.21337, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.174533, 4.45059, 0.0), EulerAngle(4.15388, 5.84685, 6.28319),
        EulerAngle(3.28122, 0.0, 0.680678), EulerAngle(2.93215, 0.0, 5.53269),
    ),
    POSE_13(
        true,
        EulerAngle(0.0, 0.0, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(4.39823, 0.471239, 0.0), EulerAngle(4.59022, 5.84685, 6.28319),
        EulerAngle(3.28122, 0.0, 0.680678), EulerAngle(2.93215, 0.0, 5.53269),
    ),
    POSE_14(
        true,
        EulerAngle(6.21337, 1.18682, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 6.10865), EulerAngle(0.0, 0.0, 0.174533),
        EulerAngle(0.0, 0.0, 6.03884), EulerAngle(4.55531, 1.15192, 0.0),
    ),
    POSE_15(
        true,
        EulerAngle(6.24828, 0.506145, 0.0), EulerAngle(0.0, 0.0, 0.0),
        EulerAngle(0.0, 0.0, 6.10865), EulerAngle(0.0, 0.0, 0.174533),
        EulerAngle(0.10472, 0.0, 6.21337), EulerAngle(4.15388, 0.610865, 0.0),
    ),
    ;
}
