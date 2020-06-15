package com.wangzhen.jvm.classConstant;

import com.wangzhen.jvm.classPackage.ClassReader;
import com.wangzhen.jvm.utils.ByteUtils;

public class ConstantClassInfo extends ConstantInof{
    public ConstantPool constantPool;

    // 类的全限定名索引
    public int nameIndex;

    public String className;

    public ConstantClassInfo(ConstantPool constantPool,ClassReader classReader) {
        readInfo(classReader);
        this.constantPool = constantPool;
    }

    @Override
    void readInfo(ClassReader classReader) {
        nameIndex= ByteUtils.bytesToInt(classReader.readNByte(2));
    }

    public String getClassName() {
        ConstantUtf8Info constantUtf8Info = (ConstantUtf8Info) this.constantPool.getConstantInofs()[nameIndex];
        return constantUtf8Info.getValue();
    }


}
