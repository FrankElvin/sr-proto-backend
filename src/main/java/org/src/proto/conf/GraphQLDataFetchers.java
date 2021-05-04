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
                    "company_name", "Petya Company",
                    "company_balance", "0.5"),
            ImmutableMap.of("report_id", "2",
                    "company_name", "Sanya LTD",
                    "company_balance", "1.5"),
            ImmutableMap.of("report_id", "3",
                    "company_name", "Malika Industries",
                    "company_balance", "0.7"),
            ImmutableMap.of("report_id", "4",
                    "company_name", "Kate GmbH",
                    "company_balance", "0.5"),
            ImmutableMap.of("report_id", "5",
                    "company_name", "Kate's Nikita Technologies",
                    "company_balance", "0.3")
    );

    public DataFetcher getReportById() {
        return dataFetchingEnvironment -> {
            String reportId = dataFetchingEnvironment.getArgument("report_id");
            return reports
                    .stream()
                    .filter(report -> report.get("report_id").equals(reportId))
                    .findFirst()
                    .orElse(null);
        };
    }

}
