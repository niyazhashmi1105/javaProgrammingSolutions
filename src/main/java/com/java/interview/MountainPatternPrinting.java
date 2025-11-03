package com.java.interview;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MountainPatternPrinting {

    public static void main(String[] args) {

        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }

        for(int row = n-1; row>=1; row--){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
