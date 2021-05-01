package org.src.proto.conf;

import com.google.common.collect.ImmutableMap;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class GraphQLDataFetchers {

    private static List<Map<String, String>> reports = Arrays.asList(
            ImmutableMap.of("report_id", "1",
                    "company_name", "company_1",
                    "company_balance", "1234"),
            ImmutableMap.of("report_id", "2",
                    "company_name", "company_2",
                    "company_balance", "1234")
    );

    public DataFetcher getReportById() {
        return dataFetchingEnvironment -> {
            String reportId = dataFetchingEnvironment.getArgument("report_id");
            return reports
                    .stream()
                    .filter(book -> book.get("report_id").equals(reportId))
                    .findFirst()
                    .orElse(null);
        };
    }

}
