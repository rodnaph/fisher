
(ns fisher.core
  (:import (java.lang.management ManagementFactory RuntimeMXBean)))

(defn general
  "General memory/uptime stats"
  []
  (let [rt (Runtime/getRuntime)]
    {:uptime (.getUptime (ManagementFactory/getRuntimeMXBean))
     :memory {:total (.totalMemory rt)
              :free (.freeMemory rt)
              :max (.maxMemory rt)
              :used (- (.totalMemory rt) (.freeMemory rt))}}))

