package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.VehicleCategoryModel;
import com.pluralsight.conferencedemo.models.VehicleTaxDto;
import com.pluralsight.conferencedemo.models.VehicleTaxModel;
import com.pluralsight.conferencedemo.models.VehicleTypeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository("vehicleRepository")
public class VehicleRepositoryImpl implements VehicleRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public VehicleRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<VehicleCategoryModel> listVehicleCategories(Optional<Long> EndingBefore, Optional<Long> StartingAfter, Long Limit) {
        String query = "";
        if (EndingBefore != null)
        {

            query =  new StringBuilder().append( "SELECT a.*, LEAD(a.id) OVER(ORDER BY a.id DESC) prev,")
              .append("FIRST_VALUE(a.id) OVER(ORDER BY a.id DESC) \"\"next\"\"")
           .append("FROM public.vehicle_category a")
           .append("WHERE a.id < @EndingBefore")
            .append("ORDER BY a.id desc").append(Limit >= 0 ? "LIMIT" + Limit.toString() : "").toString();

        }
//        else if (StartingAfter != null)
//        {
//            query = $@"SELECT * FROM (
//            SELECT
//            a.*,
//                    LEAD(a.id) OVER(ORDER BY a.id DESC) prev,
//                FIRST_VALUE(a.id) OVER(ORDER BY a.id DESC) ""next""
//            FROM public.vehicle_category a
//            WHERE a.id < @StartingAfter
//                ORDER BY a.id desc {(Limit >= 0 ? "LIMIT @Limit" : "")}
//
//                                ) list ORDER BY id desc
//            ";
//        }
//        else
//        {
//            query = $@"SELECT
//            a.*,
//                    LEAD(a.id) OVER(ORDER BY a.id DESC) prev,
//                null ""next""
//            FROM public.vehicle_category a
//            ORDER BY a.id desc {(Limit >= 0 ? "LIMIT @Limit" : "")}
//
//            ";
//        }
    }

    public List<VehicleTypeModel> listVehicleType(Optional<Long> EndingBefore, Optional<Long> StartingAfter, Optional<Long> VehicleCategoryId, Long Limit) {
        return null;
    }

    public List<VehicleTaxModel> listVehicleTax(Optional<Long> EndingBefore, Optional<Long> StartingAfter, Optional<Long> VehicleCategoryId, Long Limit) {
        return null;
    }

    public List<VehicleTaxDto> listVehicleTaxSearchAndSort(Map<String, Object> SearchBy, Map<String, Object> SortBy) {
        return null;
    }

    public VehicleTaxDto fetchVehicleTaxByTypeId(Long VehicleTypeId) {
        return null;
    }
}
