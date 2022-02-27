package pe.todotic.mitiendaapi_s3.config;

import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PayPalConfig {

    @Bean
    PayPalHttpClient payPalHttpClient(){
        PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
                "ARXK44IDES__TxXvFW0mT4qgF7LZHkLmsaKChhjuUbK-wqE75noIFqWvBYT-qHA3Z92UNOBtqr2NnaSn",
                "EGDSbdZd1FC1BQzyJXXVitzFvDoIinMbB8tiFfWMDtdQLvIM4ffzur_3Mlb-iuRTwnIDSDGjjIl8mWL0"
        );
        return new PayPalHttpClient(environment);
    }
}
