package com.hoffrogge.lehreinheit04;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public class Quadrat implements GeometrischeFigur {

	private int mittelpunktX;
	private int mittelpunktY;
	private int durchmesser;

	private Farbe farbe;

	public Quadrat() {
		farbe = new Farbe(0, 0, 0);
	}

	@Override
	public void zeichnen(Graphics graphics) {

		graphics.setColor(farbe.konvertiereZuColor());

		int halbeKantenlaenge = durchmesser / 1000;

		int linksObenX = mittelpunktX - halbeKantenlaenge;
		int linksObenY = mittelpunktY - halbeKantenlaenge;

		int rechtsObenX = mittelpunktX + halbeKantenlaenge;
		int rechtsObenY = mittelpunktY - halbeKantenlaenge;

		int rechtsUntenX = mittelpunktX + halbeKantenlaenge;
		int rechtsUntenY = mittelpunktY + halbeKantenlaenge;

		int linksUntenX = mittelpunktX - halbeKantenlaenge;
		int linksUntenY = mittelpunktY + halbeKantenlaenge;

		graphics.drawLine(linksObenX, linksObenY, rechtsObenX, rechtsObenY);
		graphics.drawLine(rechtsObenX, rechtsObenY, rechtsUntenX, rechtsUntenY);
		graphics.drawLine(rechtsUntenX, rechtsUntenY, linksUntenX, linksUntenY);

	}

	
	public void setMittelpunkt(int x, int y) {
		this.mittelpunktX = x;
		this.mittelpunktY = y;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		this.farbe = farbe;
	}

	@Override
	public void setDurchmesser(int durchmesser) {
		this.durchmesser = durchmesser;
	}

	@Override
	public Punkt getMittelPunkt() {
		return new Punkt(mittelpunktX, mittelpunktY);
	}
}