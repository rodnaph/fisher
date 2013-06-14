
# Fisher, Application Stats Helper

Fisher provides some basic statistics on your running application.
These can be easily used to check the status of the application
via a data endpoint for example.

## Usage

Fisher is available via [Clojars](https://clojars.org/rodnaph/fisher).

```clojure
(ns my-namespace
 (:require [fisher.core :as stats]))

(println
 (stats/general))
```

## Disclaimer

I got this code off a link on Twitter that I've now forgotten, but
found it so useful I didn't want to just copy/paste it between projects.
So here it is.

