package cl.uchile.dcc.scrabble.AST.operands.logical;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ASTandTest {
    private boolean T = true;
    private boolean F = false;
    private SBoolean b;
    private SBoolean f;

    @BeforeEach
    void setUp() {
        b = new SBoolean(T);
        f = new SBoolean(F);
    }

    @Test
    void operate() {
        ITypes expectedResult = b.and(f);
        ITypes actualResult = new ASTand(b, f).operate();
        assertEquals(actualResult, expectedResult);
    }
}