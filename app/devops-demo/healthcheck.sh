#!/bin/bash
URL="http://localhost:3000"
STATUS=$(curl -s -o /dev/null -w "%{http_code}" $URL)
if [ "$STATUS" -eq 200 ]; then
  echo "App is healthy"
  exit 0
else
  echo "App is down"
  exit 1
fi
