package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed64x144 extends Fixed {
    public static final Fixed64x144 DEFAULT = new Fixed64x144(BigInteger.ZERO);

    public Fixed64x144(BigInteger value) {
        super(64, 144, value);
    }

    public Fixed64x144(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(64, 144, m, n);
    }
}
