(defproject lein-cljsasset "0.2.1-SNAPSHOT"
  :description "Fetch JavaScript/CSS dependencies for ClojureScript libraries"
  :url "https://github.com/pbostrom/lein-cljsasset"
  :license {:name "Eclipse"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[s3-wagon-private "1.2.0"]]
  :repositories {"snapshots" {:url        "s3p://management.maven-repo-bucket/snapshots"
                              :username   :env/aws_access_key_id
                              :passphrase :env/aws_secret_access_key}}
  :deploy-repositories [["snapshots" :snapshots]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [me.raynes/fs "1.4.6"]])

