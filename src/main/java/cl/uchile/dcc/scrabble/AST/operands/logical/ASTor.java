package cl.uchile.dcc.scrabble.AST.operands.logical;

import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTor extends twoNodes {

    public ASTor(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().or(this.getRightChild().operate());
    }
}