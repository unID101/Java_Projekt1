//    public class BermudaTriangl {
//    public static void main( String[] args ) {
//
//    Polygon Trianl = new Polygon();
//    Trianl.addPoint( 1, 1 );
//    Trianl.addPoint( 49, 1 );
//    Trianl.addPoint( 1, 49 );
//
//    int x = (int) (Math.random() * 50);
//    int y = (int) (Math.random() * 50);
//    System.out.println(x);
//    System.out.println(y);
//    Point ship = new Point( x, y );
//
//    boolean inside = Trianl.contains( ship );
//    System.out.println( inside );
//
//    for (int i = 0; i < ship.x && ship.x < 50; i++)
//    {
//      for (int ii = 0; ii < ship.y && ship.y < 50; ii++)
//        System.out.print( Trianl.contains( ship ) ? "\u2620" : "\ud83c\udf08" );
//    }
//  }
//}

//--------------------------------------------------------------------------------------------------

import java.awt.*;

public class BermudaTriangl {
  public static void main( String[] args ) {
    java.awt.Polygon bermuda = new java.awt.Polygon();

    // Dimensions of the Bermuda triangle
    bermuda.addPoint( 10, 40 );
    bermuda.addPoint( 20, 5 );
    bermuda.addPoint( 40, 20 );

    // Inside the Bermuda triangle?
    java.awt.Point ship = new java.awt.Point(
        (int) (Math.random() * 50), (int) (Math.random() * 50) );
    System.out.println( bermuda.contains( ship ) );

    final int DIMENSION = 50;
    final String RAINBOW = "\uD83C\uDF08";
    final String FOG = "\uD83C\uDF2B";
    final String OCTOPUS = "\uD83D\uDC19";

    // For every coordinate pair test if inside triangle
    for ( int y = 0; y < DIMENSION; y++ ) {
      for ( int x = 0; x < DIMENSION; x++ ) {
        if ( x == ship.x && y == ship.y )
          System.out.print( "\ud83d\udea2" );
        else if ( x == 0 || y == 0 || x == DIMENSION - 1 || y == DIMENSION - 1 )
          System.out.print( RAINBOW );
        else
          System.out.print( bermuda.contains( x, y ) ? OCTOPUS : FOG );
      }
      System.out.println();
    }
    System.out.println( bermuda );
  }

  static Polygon resetWithRandomTriangle( Polygon poly ) {
    poly.reset();

    poly.addPoint( (int) (Math.random() * 50), (int) (Math.random() * 50) );
    poly.addPoint( (int) (Math.random() * 50), (int) (Math.random() * 50) );
    poly.addPoint( (int) (Math.random() * 50), (int) (Math.random() * 50) );

    return poly;
  }

  static Polygon createRandomTriangle() {
    return resetWithRandomTriangle( new Polygon() );
  }
}


