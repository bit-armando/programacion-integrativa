package com.mycompany.youtube;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.File;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class S3 {
    public static void Upload(String name, String path) throws SQLException{
        conectorDB sel = new conectorDB();
        ArrayList<String> secret;
        secret = sel.getUserS3();
        
        String bucketName = "yutu-programacion-integrativa";
        BasicAWSCredentials credentials = new BasicAWSCredentials(secret.get(0), secret.get(1));
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
        .withCredentials(new AWSStaticCredentialsProvider(credentials))
        .withRegion(Regions.US_EAST_1) // Cambia la región según tus necesidades
        .build();   
        
        try{
            s3Client.putObject(new PutObjectRequest(bucketName, name, new File(path)));
            System.out.println("Archivo subido exitosamente");
        } catch (SdkClientException e){
            System.err.println("Error al subir el archivo: " + e.getMessage());
        }
    }
}
