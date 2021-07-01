package cl.uchile.dcc.scrabble.types;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SStringTest {

    private SString str1;
    private SString str2;
    private boolean T = true;
    private boolean F = true;
    //private SBoolean Strue;
    //private SBoolean Sfalse;
    private Random rng;
    private int seed;
    private int strSize_1;
    private int strSize_2;
    private String random_string_1;
    private String random_string_2;
    private String random_binary_value_1;
    private char[] zeroOne = {'0', '1'};

    @BeforeEach
    void setUp() {
        str1 = new SString("Hola");
        str2 = new SString("Chao");
        //Strue = new SBoolean(T);
        //Sfalse = new SBoolean(F);
        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize_1 = rng.nextInt(20) + 1;
        strSize_2 = rng.nextInt(20);
        random_binary_value_1 = RandomStringUtils.random(strSize_1, zeroOne); strSize_1 = rng.nextInt(20);
        random_string_1 = RandomStringUtils.random(strSize_2, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        random_string_2 = RandomStringUtils.random(strSize_2, 0, Character.MAX_CODE_POINT, true, false, null, rng);

    }

    @Test
    void constructorTest(){
        var expectedSString = new SString("Hola");
        assertEquals(expectedSString.hashCode(), str1.hashCode());
        assertEquals(expectedSString, str1);
        assertNotEquals(expectedSString, str2);
        //assertNotEquals(str1, Strue); //TODO
    }

    @RepeatedTest(100)
    void asString() {
        int random_1 = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double random_double_1 = random_1 * random_between_0_1;
        //SInt I = new SInt(random_1);
        //SFloat F = new SFloat(random_double_1);
        //SBinary bin_1 = new SBinary(random_binary_value_1);
        SString S1 = new SString(random_string_1);
        SString S2 = new SString(random_string_2);

        String expectedResult_S_value = S1.toString();
        SString expectedResult_S = new SString(expectedResult_S_value);
        SString actualResult_S = S1.asString();
        assertEquals(expectedResult_S, actualResult_S);

        /*

        String expectedResult_value_INT = I.toString();
        SString expectedResult_INT = new SString(expectedResult_value_INT);
        SString actualResult_INT = I.asString();
        assertEquals(expectedResult_INT, actualResult_INT);


        String expectedResult_value_FLT = F.toString();
        SString expectedResult_FLT = new SString(expectedResult_value_FLT);
        SString actualResult_FLT = F.asString();
        assertEquals(expectedResult_FLT, actualResult_FLT);


        String expectedResult_value_BIN = bin_1.asString().toString();
        SString expectedResult_BIN = new SString(expectedResult_value_BIN);
        SString actualResult_BIN = bin_1.asString();
        assertEquals(expectedResult_BIN, actualResult_BIN);


        String expectedResult_value_STrue = Strue.asString().toString();
        SString expectedResult_STrue = new SString(expectedResult_value_STrue);
        SString actualResult_STrue = Strue.asString();
        assertEquals(expectedResult_STrue, actualResult_STrue);


        String expectedResult_value_SFalse = Sfalse.asString().toString();
        SString expectedResult_SFalse = new SString(expectedResult_value_SFalse);
        SString actualResult_SFalse = Sfalse.asString();
        assertEquals(expectedResult_SFalse, actualResult_SFalse);
        */
    }

    @RepeatedTest(100)
    void add() {

        int random_1 = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double random_double_1 = random_1 * random_between_0_1;
        //SInt I = new SInt(random_1);
        //SFloat F = new SFloat(random_double_1);
        //SBinary bin_1 = new SBinary(random_binary_value_1);
        SString S1 = new SString(random_string_1);
        SString S2 = new SString(random_string_2);

        String expectedResult_value_S = S1.toString() + S2.toString();
        SString expectedResult_S = new SString(expectedResult_value_S);
        SString actualResult_S = S1.add(S2);
        assertEquals(expectedResult_S, actualResult_S);
        /*
        String expectedResult_value_INT = S1.toString() + I.toString();
        SString expectedResult_INT = new SString(expectedResult_value_INT);
        SString actualResult_INT = S1.add(I);
        assertEquals(expectedResult_INT, actualResult_INT);

        String expectedResult_value_FLT = S1.toString() + F.toString();
        SString expectedResult_FLT = new SString(expectedResult_value_FLT);
        SString actualResult_FLT = S1.add(F);
        assertEquals(expectedResult_FLT, actualResult_FLT);

        String expectedResult_value_BIN = S1.toString() + bin_1.toString();
        SString expectedResult_BIN = new SString(expectedResult_value_BIN);
        SString actualResult_BIN = S1.add(bin_1);
        assertEquals(expectedResult_BIN, actualResult_BIN);


        String expectedResult_value_STrue = S1.toString() + Strue.asString().toString();
        SString expectedResult_STrue = new SString(expectedResult_value_STrue);
        SString actualResult_STrue = S1.add(Strue);
        assertEquals(expectedResult_STrue, actualResult_STrue);


        String expectedResult_value_SFalse =  S1.toString() +Sfalse.asString().toString();
        SString expectedResult_SFalse = new SString(expectedResult_value_SFalse);
        SString actualResult_SFalse = S1.add(Sfalse);
        assertEquals(expectedResult_SFalse, actualResult_SFalse);
        */
    }

    @Test
    void testToString() {
        String str_content = "Hola";
        String Sstr_content = str1.toString();
        assertEquals(str_content, Sstr_content);
    }
}