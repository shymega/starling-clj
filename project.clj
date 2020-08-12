(defproject com.github.shymega/starling-clj "0.0.0"
  :description "Clojure library for Starling's API"
  :url "https://github.com/shymega/starling-clj"
  :license {:name "Apache License 2.0"
            :url  "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies []
  :plugins [[lein-cloverage "1.0.13"]
            [lein-shell "0.5.0"]
            [lein-ancient "0.6.15"]
            [lein-changelog "0.3.2"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.0"]]}}
  :deploy-repositories [["releases" :clojars]]
  :aliases {"update-readme-version" ["shell" "sed" "-i" "s/\\\\[com\\.github\\.shymega\\\\/starling-clj \"[0-9.]*\"\\\\]/[com\\.github\\.shymega\\\\/starling-clj \"${:version}\"]/" "README.md"]}
  :release-tasks [["shell" "git" "diff" "--exit-code"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["changelog" "release"]
                  ["update-readme-version"]
                  ["vcs" "commit"]
                  ["vcs" "tag"]
                  ["deploy"]
                  ["vcs" "push"]])
