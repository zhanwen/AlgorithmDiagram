#需要覆盖的州
states_needs = set(['mt', 'wa', 'or', 'id', 'nv', 'ut', 'ca', 'az'])

#广播站
stations = {}
stations['kone'] = set(['id', 'nv', 'ut'])
stations['ktwo'] = set(['wa', 'id', 'mt'])
stations['kthree'] = set(['or', 'nv', 'ca'])
stations['kfour'] = set(['nv', 'ut'])
stations['kfive'] = set(['ca', 'az'])


final_stations = set()

while states_needs :
    best_stations = None
    # 覆盖的州
    states_covered = set()
    #key,value
    for station, states_for_station in stations.items() :
        convered = states_needs & states_for_station
        if(len(convered) > len(states_covered)) :
            best_stations = station
            states_covered = convered
        states_needs -= states_covered
        final_stations.add(best_stations)

print(final_stations)