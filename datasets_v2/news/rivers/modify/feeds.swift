import SwiftUI
struct feeds: View {
    
    var body: some View {
        VStack
        {
            Text("")
                .padding(5)
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .listStyle(PlainListStyle())
        }}}

struct feeds_Previews: PreviewProvider {
    static var previews: some View {
        feeds()
    }
}
