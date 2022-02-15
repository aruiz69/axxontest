package com.appsdeveloperblog.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.thoughtworks.xstream.XStream;

@SpringBootApplication
@Import({ AxonConfig.class })
public class PaymentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentserviceApplication.class, args);
	}

}


@org.springframework.context.annotation.Configuration
class AxonConfig {
 
    @Bean
    public XStream xStream() {
        XStream xStream = new XStream();
      
        xStream.allowTypesByWildcard(new String[] {
                "com.appsdeveloperblog.**"
        });
        return xStream;
    }
}
