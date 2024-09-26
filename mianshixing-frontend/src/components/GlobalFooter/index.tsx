import React from "react";
import "./index.css";

/**
 * 全局底部栏组件
 * @constructor
 */
export default function GlobalFooter() {
  const currentYear = new Date().getFullYear();

  return (
    <div className="global-footer">
      <div>© {currentYear} 面试星在线刷题</div>
      <div>
        <a href="https://github.com/lllieee/mianshixing.git" target="_blank">
          作者：张三
        </a>
      </div>
    </div>
  );
}
