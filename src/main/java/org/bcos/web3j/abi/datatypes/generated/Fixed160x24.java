package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed160x24 extends Fixed {
    public static final Fixed160x24 DEFAULT = new Fixed160x24(BigInteger.ZERO);

    public Fixed160x24(BigInteger value) {
        super(160, 24, value);
    }

    public Fixed160x24(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(160, 24, m, n);
    }
}
