package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed120x96 extends Fixed {
    public static final Fixed120x96 DEFAULT = new Fixed120x96(BigInteger.ZERO);

    public Fixed120x96(BigInteger value) {
        super(120, 96, value);
    }

    public Fixed120x96(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(120, 96, m, n);
    }
}
