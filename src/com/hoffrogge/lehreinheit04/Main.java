package com.hoffrogge.lehreinheit04;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit03.Rechteck;

public class Main {

	public static void main(String[] args) {

		Zeichenbrett zeichenbrett = new Zeichenbrett();

		TetrominoBlock tetrominoBlock = new TetrominoBlock();
		tetrominoBlock.setLinienFarbe(new Farbe(0, 0, 0));
		tetrominoBlock.setMittelpunkt(50, 50);
		tetrominoBlock.setDurchmesser(50);

		zeichenbrett.fuegeZeichenbaresObjektHinzu(tetrominoBlock);
		
		
//		Dreieck dreieck = new Dreieck();
//		dreieck.setMittelpunkt(100, 100);
//		dreieck.setDurchmesser(50);
		
		
//		zeichenbrett.fuegeZeichenbaresObjektHinzu(dreieck);
		
		
				zeichenbrett.zeichneAlleZeichenbarenObjekte();
	}
}