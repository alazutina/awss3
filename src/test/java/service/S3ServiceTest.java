package service;

import net.anna.service.S3Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class S3ServiceTest {
    @Autowired
    private S3Service s3Service;

    @Test
    public void testCreateBucket() {
        s3Service.createBucket();
    }
}