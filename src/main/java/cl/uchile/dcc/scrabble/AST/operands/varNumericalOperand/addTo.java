package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class addTo implements INodes {
    String varName;
    ITypes addend;
    Map<String, ITypes> map = getMapVar();
    public addTo(String varName, ITypes addend) {
        this.varName = varName;
        this.addend = addend;
    }

    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes result = a.add(addend);
        map.put(varName, result);
        return null;
    }
}