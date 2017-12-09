package com.flowacademy.gep.stat;

import com.flowacademy.gep.Teherauto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TeherAutoStat {

    private HashMap<String, Set <Integer> > teherbiras = new HashMap<>();

    public TeherAutoStat(HashMap<String, Set<Integer>> teherbiras) {
        this.teherbiras = teherbiras;
    }

    public void teherBiras(Teherauto teherAutoTipus) {
            if ( teherbiras.containsKey(teherAutoTipus.getTipus() )) {
                Set<Integer> teherbirasok = teherbiras.get(teherAutoTipus.getTipus());
                teherbirasok.add(teherAutoTipus.getTeherbiras());
                teherbiras.put(teherAutoTipus.getTipus(), teherbirasok);
            } else {
                Set<Integer> teherbirasok = new HashSet<Integer>();
                teherbiras.put(teherAutoTipus.getTipus(), teherbirasok);
            }
        }
}

