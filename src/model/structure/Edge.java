/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.structure;

import java.awt.Graphics;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class Edge {

    private final Vertex left;
    private final Vertex right;

    public Edge(Vertex left, Vertex right) {
        this.left = left;
        this.right = right;
    }

    public void paint(Graphics g) {
        g.drawLine(left.getX(), left.getY(), right.getX(), right.getY());
    }
}
