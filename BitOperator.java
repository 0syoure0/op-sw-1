// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;

/**
 * BitOperator 클래스의 설명을 작성하세요.
 * @author (이수영) @version (24.03.26)
 */
public class BitOperator
{

    /**
     * 
     */
    static public void main(String[] args)
    {
        short a = (short)0x55ff;
        short b = (short)0x00ff;
        /* 비트 노ㄴ리 연산*/
        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n", (short)(a & b));
        /* 비트 AND*/
        System.out.printf("%04x\n", (short)(a | b));
        /* 비트 OR*/
        System.out.printf("%04x\n", (short)(a ^ b));
        /* 비트 XOR*/
        System.out.printf("%04x\n", (short)( ~ a));
        /* 비트 NOT*/
        byte c = 20;
        /* 0x14*/
        byte d = -8;
        /* 0xf8 비트 시프트 연산*/
        System.out.println("[시프트 연산 결과]");
        System.out.println(c << 2);
        /* c를 2비트 왼쪽 시프트*/
        System.out.println(c >> 2);
        /* c를 2비트 오른쪽 시프트. 0 삽입*/
        System.out.println(d >> 2);
        /* d를 2비트 오른쪽 시프트. 1 삽입*/
        System.out.printf("%x\n", (d >>> 2));
        /* d를 2비트 오른쪽 시프트. 0 삽입*/
    }
}
