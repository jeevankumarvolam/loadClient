package com.example.coreDbPerformance.repository;

import com.example.coreDbPerformance.pojo.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    @Query(nativeQuery = true, value = "SELECT fn_MASK_CARD(:text,)")
    List<Player> getUsers(@Param("text") String text);
//
//    @Query(nativeQuery = true, value = "SELECT fn_MASK_CARD(:text)")
//    List<Player> removeChips(@Param("text") String text);.
//    @Query(nativeQuery = true, value = "SELECT fn_MASK_CARD(:text)")
//    List<Player> setChips(@Param("text") String text););
//    @Query(nativeQuery = true, value = "SELECT fn_MASK_CARD(:text)")
//    List<Player> endGame(@Param("text") String text););

    @Query(nativeQuery = true, value = "SELECT fn_MASK_CARD(:atTable,:userType,:userName," +
            ":tableName,:chips,:usercode,:umtId,:subgameType,:status,:in_pt_removeflag," +
            ":in_ptrecid,:out_purchasebkt,:out_bonusbkt,:out_winningsbkt,:out_nwbkt,:out_finalchips)")
    List<Player> leaveTable(@Param("atTable") String atTable,
                            @Param("userType") String tableType,
                            @Param("userName") String userName,
                            @Param("tableName") String tableId,
                            @Param("chips") double chips,
                            @Param("usercode") String usercode,
                            @Param("umtId") int umtId,
                            @Param("subgameType") String subgameType,
                            @Param("status") int status,
                            @Param("in_pt_removeflag")String ptRemoveFlag,
                            @Param("in_ptrecid") Long gameRecId,
                            @Param("out_purchasebkt") double out_purchasebkt,
                            @Param("out_bonusbkt") double out_bonusbkt,
                            @Param("out_winningsbkt") double out_winningsbkt,
                            @Param("out_nwbkt") double out_nwbkt,
                            @Param("out_finalchips") double out_finalchips
                            );











}
