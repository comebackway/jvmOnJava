package com.wangzhen.jvm.instruction.stack.dup;

import com.wangzhen.jvm.instruction.base.NoOperandsInstruction;
import com.wangzhen.jvm.runtimeData.JFrame;
import com.wangzhen.jvm.runtimeData.OperandStack;
import com.wangzhen.jvm.runtimeData.Slot;

public class DUP2 extends NoOperandsInstruction {
    @Override
    public void execute(JFrame frame) {
        OperandStack stack = frame.getOperandStack();
        Slot slot1 = stack.popSlot();
        Slot slot2 = stack.popSlot();
        stack.pushSlot(slot2);
        stack.pushSlot(slot1);
        stack.pushSlot(slot2);
        stack.pushSlot(slot1);
    }
}
