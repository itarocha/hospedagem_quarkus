package br.com.itarocha.controllers;

import br.com.itarocha.chb.domain.DestinacaoHospedagem;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.jooq.*;
import org.jooq.conf.Settings;
import org.jooq.impl.DefaultConfiguration;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static br.com.itarocha.chb.adapter.out.persistence.jooq.data.Tables.DESTINACAO_HOSPEDAGEM;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@QuarkusTest
@QuarkusTestResource(MariadbResource.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GreetingControllerTest {

    // https://www.morling.dev/blog/quarkus-and-testcontainers/
    //https://dev.to/lucasscharf/quarkus-e-testcontainers-o-pikachu-dos-ambientes-de-testes-omb

    @Inject
    DSLContext create;

    @Test
    @Order(2)
    void testDsl(){

        create.resultQuery("SHOW SCHEMAS").fetch().forEach(x -> System.out.println(x));
        create.resultQuery("SHOW TABLES").fetch().forEach(x -> System.out.println(x));
        //create.resultQuery("SELECT * FROM betesda.destinacao_hospedagem").fetch().forEach(x -> System.out.println(x));


        Configuration config = new DefaultConfiguration();
        config.set(new Settings().withRenderSchema(true));
//        String sql =
//        DSL.using(config)
//                .selectFrom(DESTINACAO_HOSPEDAGEM)
//                .getSQL();
//        System.out.println(sql);
//
//


        var registro = create.insertInto(DESTINACAO_HOSPEDAGEM,
                DESTINACAO_HOSPEDAGEM.DESCRICAO)
                .values("ALFA")
                .values("BETA")
                .values("GAMA")
                //.valuesOfRecords( registro )
                //.returning(DESTINACAO_HOSPEDAGEM.ID)
                //.fetch();
                .execute();

        create.resultQuery("SELECT LAST_INSERT_ID()").fetch().forEach(x -> System.out.println("LAST INSERT ID = " + x));

        //.returningResult(DESTINACAO_HOSPEDAGEM.ID)
        //.fetchOne();

        System.out.println("REGISTRO: " + registro);


        //////////create.insertInto(DESTINACAO_HOSPEDAGEM, DESTINACAO_HOSPEDAGEM.DESCRICAO).values("NOVO").values("BETA").values("GAMA").execute();

        //https://www.jooq.org/doc/latest/manual/sql-building/sql-statements/select-statement/select-clause/

        ResultQuery r = create.resultQuery("SELECT * FROM destinacao_hospedagem");
        List<DestinacaoHospedagem> lista = r.fetchInto(DestinacaoHospedagem.class);
        r.stream().forEach(s -> System.out.println(s));

        create.select().from(DESTINACAO_HOSPEDAGEM).fetch();
        Result<?> res = create.select(DESTINACAO_HOSPEDAGEM.ID, DESTINACAO_HOSPEDAGEM.DESCRICAO).from(DESTINACAO_HOSPEDAGEM).fetch();
        res.forEach(x -> System.out.println(x));

        //Result<?> res = create.select(DESTINACAO_HOSPEDAGEM.ID, DESTINACAO_HOSPEDAGEM.DESCRICAO).fetch();
        System.out.println(res.stream().count());
//

        assertEquals(3, 2+1);
    }

}