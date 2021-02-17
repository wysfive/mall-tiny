package com.macro.mall.tiny.service;

import com.macro.mall.tiny.nosql.mongodb.document.MemberReadHistory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员浏览记录管理service
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
