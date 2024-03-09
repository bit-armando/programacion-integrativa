package com.mycompany.youtube;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.File;

public class S3 {
    public static void Upload(String name, String path){
        String bucketName = "yutu-programacion-integrativa";
        AmazonS3 s3Client = AmazonS3ClientBuilder.defaultClient();
        
        try{
            s3Client.putObject(new PutObjectRequest(bucketName, name, new File(path)));
            System.out.println("Archivo subido exitosamente");
        } catch (SdkClientException e){
            System.err.println("Error al subir el archivo: " + e.getMessage());
        }
    }
}
