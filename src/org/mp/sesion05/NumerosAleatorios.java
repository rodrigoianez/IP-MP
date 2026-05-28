package org.mp.sesion05;


public class NumerosAleatorios
{
    private static final int A = 48271;
    private static final int M = 2147483647;
    private static final int Q = M / A;
    private static final int R = M % A;

    private int estado;

    public NumerosAleatorios( )
    {
        this( (int) ( System.currentTimeMillis( ) % Integer.MAX_VALUE ) );
    }

    
    public NumerosAleatorios( int valorInicial )
    {
        if( valorInicial < 0 )
            valorInicial += M;

        estado = valorInicial;
        if( estado == 0 )
            estado = 1;
    }

    public int randomInt( )
    {
        int estadoTmp = A * ( estado % Q ) - R * ( estado / Q );
        if( estadoTmp >= 0 )
            estado = estadoTmp;
        else
            estado = estadoTmp + M;

        return estado;
    }

    public double randomReal( )
    {
        return randomInt( ) / ( double ) M;
    }

    public int randomInt( int linf, int lsup )
    {
        double tamanyoParticion = (double) M / ( lsup - linf + 1 );

        return (int) ( randomInt( ) / tamanyoParticion ) + linf;
    }

    public static final void permuta( Object [ ] a )
    {
        NumerosAleatorios r = new NumerosAleatorios( );

        for( int j = 1; j < a.length; j++ )
            swapReferencias( a, j, r.randomInt( 0, j ) );
    }

    public static void swapReferencias( Object [ ] a, int index1, int index2 )
    {
        Object tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

}