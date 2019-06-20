# share
[TDD - Test-Driven Development]

![image](https://github.com/frieda0503/share_repo/blob/master/TDD-e1492712699769-300x300.png)
* UT基本準則
  1. 一個測試案例只測一種方法
  2. 最小的測試單位
  3. 不與外部（包括檔案、資料庫、網路、服務、物件、類別）直接相依
  4. 不具備邏輯
  5. 測試案例之間相依性為零

* 撰寫單元測試的時機點，簡單分成三個
  1. 外部需要使用物件，並對其執行結果有所預期時(developing)
  2. feature的異動時(modifying)
  3. 出現非預期執行結果時(bug fixing)
 * FizzBuzzServiceTest

[BDD - Behavior-Driven Development]
* 效益：能讓使用者、測試人員與開發人員，可以用一樣的方式來描述與了解需求，並且降低將人話轉換成程式碼的成本
來描述「驗收測試案例」所對應的「系統行為與腳本」
* 開發流程
  1. user story：定義與管理使用者需求
  2. acceptance test cases：定義user story的完成事項
  3. BDD的Feature與Scenario：描述acceptance test cases所對應的系統行為
  4. BDD的step template：用來放TDD的測試案例
  5. 進入TDD循環
* 開發工具：cucumber  
  1. Feature：一個feature代表一個功能，大小相當於一個user story
  2. Scenario：一個功能的操作路徑，以驗收測試的角度來看，一個scenario就是一個驗收測試案例。因為一個feature可以包含好幾的scenario，所以一個Cucumber的.feature檔案相當於好幾個的測試案例，如果這些測試案例全部通過，就代表這個feature通過驗收條件。
  3. Step：一個scenario的操作步驟。在Cucumber裡面scenario的標準寫法由given-when-then所組成。Given的步驟用來描述要準備那些測試環境（相當於單元測試裡面的準備test fixture），when的步驟用來描述如何執行待測程式（相當於單元測試裡面的execution），then的步驟用來描述如何驗證測試是否成功（相當於單元測試裡面的assertion）。

 * FizzBuzzStep
 * FizzBuzzStepTest
 * FizzBuzz.feature
 
 
 ![image](https://github.com/frieda0503/share_repo/blob/master/tdd_v_bdd_cycle-1024x538.png)

 [參考資料]
 https://ithelp.ithome.com.tw/articles/10102264
