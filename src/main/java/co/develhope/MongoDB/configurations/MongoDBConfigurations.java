package co.develhope.MongoDB.configurations;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;

@Configuration
public class MongoDBConfigurations extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "develhope";
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return super.getMappingBasePackages();
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://Andrea:Permongo1@cluster0.moptybi.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

    protected boolean autoIndexCreation() {
        return true;
    }
}
