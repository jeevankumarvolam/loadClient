package com.example.coreDbPerformance.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "players")
public class Player implements Comparable<Player> {
//    @Id
//  @GeneratedValue
//    private long playerId;

    @Id
    private String playerId= UUID.randomUUID().toString().replace("-","");
    @Column(name = "player_name")
    private String playerName;
    @Column(name = "source")
    private String playerSource;
    @Column(name = "device_id")
    private String device_id;
    @Column(name = "a23_pan_name")
    private String a23PanName;
    @Column(name = "a23_pan_number")
    private String a23PanNumber;

    @Column(name = "chips")
    private int chips;

    @Column(name = "winning_matches_count")
    private int winningMatchesCount = 0;

    @Override
    public int compareTo(Player o) {
        if (this.getChips() > o.getChips()) {
            return 1;
        } else if (this.getChips() < o.getChips()) {
            return -1;
        }
        return 0;


    }
}
