from collections import deque

graph = {}
graph["you"] = ["alice", "bob", "claire"]
graph["bob"] = ["anuj", "peggy"]
graph["alice"] = ["peggy"]
graph["claire"] = ["thom", "jonny"]
graph["anuj"] = []
graph["peggy"] = []
graph["thom"] = []
graph["jonny"] = []

def search(name) :
    search_queue = deque()
    search_queue += graph[name]
    searched = []
    while search_queue :
        person = search_queue.popleft()
        if person not in searched :
            if person_is_seller(person) :
                print("Person " + person +"is a mango seller")
                return True
            else :
                search_queue += graph[person]
                searched.append(person)
    return False


def person_is_seller(name) :
    return name[-1] == 'm'

print(search('you'))