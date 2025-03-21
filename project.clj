(defproject moirai "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/test.check "0.9.0"]
                 [com.github.seancorfield/honeysql "2.7.1295"]
                 [com.techascent/tmducken "0.10.1-01"]
                 [com.github.seancorfield/next.jdbc "1.3.1002"]
                 [org.duckdb/duckdb_jdbc "1.2.1"]]
  :main ^:skip-aot moirai.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
